document.getElementById('paymentForm').addEventListener('submit', async function(e) 
{
  e.preventDefault();
  const data = {
    payerName: document.getElementById('payerName').value,
    amount: document.getElementById('amount').value,
    paymentMethod: document.getElementById('paymentMethod').value,
    paymentDate: document.getElementById('paymentDate').value
  };
  try 
  {
    const response = await fetch("http://localhost:8080/api/payments", 
    {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(data)
    });
    const message = document.getElementById("paymentMessage");
    if (response.ok) 
      {
      message.textContent = "Payment Successful!";
      message.style.color = "lime";
      localStorage.setItem('payerName', data.payerName);
      localStorage.setItem('amount', data.amount);
      localStorage.setItem('paymentMethod', data.paymentMethod);
      localStorage.setItem('paymentDate', data.paymentDate);
      const bookingData = {
        name: data.payerName,
        amount: data.amount,
        method: data.paymentMethod,
        date: data.paymentDate
      };
      await fetch('http://localhost:8080/api/bookings/create', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(bookingData)
      });
      document.getElementById("paymentForm").reset();
      window.location.href = 'receipt.html';  
    } 
    else 
    {
      message.textContent = "Payment Failed!";
      message.style.color = "red";
    }
  } 
  catch (error) 
  {
    document.getElementById("paymentMessage").textContent = "Server Error!";
    document.getElementById("paymentMessage").style.color = "red";
  }
});
