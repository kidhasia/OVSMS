document.addEventListener("DOMContentLoaded", function() {
    const form = document.querySelector("form");
    const nameInput = document.getElementById("name");
    const contactInput = document.getElementById("contact");
    const emailInput = document.getElementById("email");
    const feedbackInput = document.getElementById("feedback");

    form.addEventListener("submit", function(event) {
        if (!validateContact(contactInput.value)) {
            alert("Please enter a valid contact number.");
            event.preventDefault();
        }

        if (!validateEmail(emailInput.value)) {
            alert("Please enter a valid email address.");
            event.preventDefault();
        }

        if (feedbackInput.value.trim() === "") {
            alert("Feedback cannot be empty.");
            event.preventDefault();
        }
    });

    function validateContact(contact) {
        const contactRegex = /^\d{10}$/;
        return contactRegex.test(contact);
    }

    function validateEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }
});
