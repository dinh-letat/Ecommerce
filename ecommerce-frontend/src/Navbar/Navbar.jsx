import React from 'react'

export const Navbar = () => {
    return (
        <div className='navbar'>
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#login">
                Sign Up
            </button>

            <div class="modal fade" id="login" tabindex="-1" aria-labelledby="login" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header  border border-0">
                            <h4 class="modal-title" id="exampleModalLabel"><b>Sign Up</b></h4>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <form className='form' action="http://localhost:8081/user/signup" method='post'>
                                <div className="form-group mb-3">
                                    <label className='form-label fw-semibold' htmlFor="username">Name</label>
                                    <input type="text" id='username' name='username' className="form-control" placeholder='Enter Your Name'/>
                                </div>
                                <div className="form-group mb-3">
                                    <label className='form-label fw-semibold' htmlFor="email">Email</label>
                                    <input type="email" id='email' name='email' className="form-control" placeholder='Enter Email Address' />
                                </div>
                                <div className="form-group mb-3">
                                    <label className='form-label fw-semibold' htmlFor="password">Password</label>
                                    <input type="password" id='password' name='password' className="form-control" placeholder='Enter Your Password' />
                                </div>
                                <div class="form-group mb-3">
                                    <button type="submit" class="btn btn-primary">Sign Up</button>
                                </div>
                                <div className="form-group">
                                    <label htmlFor="" className="form-label">
                                        <p>Already have an account?
                                            Sign in
                                        </p>
                                    </label>
                                </div>
                            </form>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    )
}
