import './App.css';
import { Navbar } from './Navbar/Navbar';
import { BrowserRouter, Routes, Route } from 'react-router-dom'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/shop" element={<Navbar/>}/>
        </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
