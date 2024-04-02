import React from 'react'
import logo from '../ecommerce-assets/freshcart-logo.svg'
// import { Link } from 'react-router-dom'
import { Login } from '../pages/Login'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

export const Navbar = () => {
    return (
        <div className="navbar">
            <div className="nav_logo">
                <img src={logo} alt="" />
            </div>
            <ul className="nav_menu">
                <li>Home</li>
                <li>Shop</li>
                <li>Page</li>
                <li>Blog</li>
                <li>Contact</li>
            </ul>
            <div className="nav_login_cart">
                <i class="fa-regular fa-heart"></i>
            </div>
        </div>
    )
}
