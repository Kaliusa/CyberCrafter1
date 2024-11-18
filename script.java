// JavaScript for handling button clicks and redirection to social media/contact details

document.addEventListener("DOMContentLoaded", function () {
    // WhatsApp Button
    document.getElementById("whatsappBtn").addEventListener("click", function () {
        window.open("https://wa.me/+923287678929", "_blank");
    });

    // Facebook Button
    document.getElementById("facebookBtn").addEventListener("click", function () {
        window.open("https://facebook.com", "_blank");
    });

    // Email Button
    document.getElementById("emailBtn").addEventListener("click", function () {
        window.location.href = "mailto:example@gmail.com";
    });

    // Open Contact Page
    document.getElementById("contactPageBtn").addEventListener("click", function () {
        window.location.href = "contact.html";
    });
});
