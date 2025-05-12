window.onload = function() 
{
    const payerName = localStorage.getItem('payerName');
    const amount = localStorage.getItem('amount');
    const paymentMethod = localStorage.getItem('paymentMethod');
    const paymentDate = localStorage.getItem('paymentDate');
    document.getElementById('payerName').textContent = payerName;
    document.getElementById('amount').textContent = amount;
    document.getElementById('paymentMethod').textContent = paymentMethod;
    document.getElementById('paymentDate').textContent = paymentDate;
    document.getElementById('downloadReceiptBtn').addEventListener('click', function()
   {
      generatePDF(payerName, amount, paymentMethod, paymentDate);
    });
  };
    function generatePDF(payerName, amount, paymentMethod, paymentDate) 
    {
    const doc = new jsPDF();
    doc.setFontSize(16);
    doc.text("Payment Receipt", 20, 20);
    doc.setFontSize(12);
    doc.text(`Name: ${payerName}`, 20, 40);
    doc.text(`Amount Paid: ₹${amount}`, 20, 50);
    doc.text(`Payment Method: ${paymentMethod}`, 20, 60);
    doc.text(`Payment Date: ${paymentDate}`, 20, 70);
    doc.save("receipt.pdf");
  }
  