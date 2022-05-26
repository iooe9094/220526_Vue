import axios from "axios";

export default axios.create({
    baseURL: "http://localhost8080/api",
    headers: {
        "Content-type": "application/json"
    }
});