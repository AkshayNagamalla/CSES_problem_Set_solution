const express = require("express");
const app = express();

app.use(express.json());

app.get("/",(req,res)=>{
    res.send("<h1>CSES - reEngineered</h1>");
});

let PORT = 3000;
app.listen(PORT,()=>{
    console.log(`Server is running on ${PORT}`);
})