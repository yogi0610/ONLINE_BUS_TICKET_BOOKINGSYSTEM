document.getElementById('bookingForm').addEventListener('submit', async function(event) {
    event.preventDefault();  
    const bookingData = {
        bookingDateTime: document.getElementById('bookingDateTime').value,
        journeyDate: document.getElementById('journeyDate').value,
        status: document.getElementById('status').value,
        bookingDate: document.getElementById('bookingDate').value,
        passengerName: document.getElementById('passengerName').value,
        ticket: null  
    };
    try {
        const response = await fetch('http://localhost:8080/api/bookings/create', 
            {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(bookingData)  
        });
        const data = await response.json();  
        if (response.ok) 
            {
            console.log('Booking created successfully:', data);
            alert('Booking successful! Redirecting to payment...');
            window.location.href = 'payment.html';  
        } 
        else 
        {
            alert('Booking failed. Please try again.');
        }
    } 
    catch (error) 
    {
        console.error('Error:', error);
        alert('Booking failed due to an error. Please try again.');
    }
});
