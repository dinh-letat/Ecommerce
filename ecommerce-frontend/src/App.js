import './App.css';
import { Navbar } from './Navbar/Navbar';
import { Login } from './pages/Login'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import { Signup } from './pages/Signup';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path='/login' element={<Login/>}/>
          <Route path='/signup' element={<Signup/>}/>
          
        </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
