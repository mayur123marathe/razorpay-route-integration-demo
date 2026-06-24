import { BrowserRouter, Routes, Route } from "react-router-dom";

import Login from "./pages/auth/Login";
import Register from "./pages/auth/Register";

import DonorDashboard from "./pages/donor/DonorDashboard";
import NgoDashboard from "./pages/ngo/NgoDashboard";

import ProtectedRoute from "./routes/ProtectedRoute";
import DonorRoute from "./routes/DonorRoute";
import NgoRoute from "./routes/NgoRoute";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />} />

        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />

        <Route element={<ProtectedRoute />}>
          <Route element={<DonorRoute />}>
            <Route path="/donor/dashboard" element={<DonorDashboard />} />
          </Route>

          <Route element={<NgoRoute />}>
            <Route path="/ngo/dashboard" element={<NgoDashboard />} />
          </Route>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
