function formatTime(hours, minutes, seconds) 
{
    return `${hours}:${minutes}:${seconds}`;
}
function updateDateTime() 
{
    const now = new Date();
    const currentDate = now.toLocaleDateString('en-GB', { day: 'numeric', month: 'long', year: 'numeric' });
    let hours = now.getHours();
    let minutes = now.getMinutes();
    let seconds = now.getSeconds();
    hours = hours < 10 ? `0${hours}` : hours;
    minutes = minutes < 10 ? `0${minutes}` : minutes;
    seconds = seconds < 10 ? `0${seconds}` : seconds;
    const currentDay = now.toLocaleString('en-GB', { weekday: 'long' });
    document.getElementById('date-text').textContent = currentDate;
    document.getElementById('time-text').textContent = formatTime(hours, minutes, seconds);
    document.getElementById('day-text').textContent = currentDay;
}
setInterval(updateDateTime, 1000);
updateDateTime();
