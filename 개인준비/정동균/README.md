# ๐ฆธโโ๏ธREADME

## 1. ์ฃผ์ ์ ์ 

์นดํ(๋์ ํธ)  ์ปค๋ฎค๋ํฐ ๊ธฐ๋ฐ SNS 

์ธ์คํ๊ทธ๋จ + ์ง๋

ํ๋กํ  ํ์์ ์ฌ์ง ์ ์

<img src="https://lh6.googleusercontent.com/-gQLyvVihl196MWBDKbE9LYMvlz7ZZ-ggRRXtwN9cDhAAoOC31Aw90ydANBUtGYlGOUFOKrB8J1aX8fJxwWpXTyiRywHJA1MG0aF7u7yDY2MUvb9JmwQctIcJnWENT4U38BNqbF_uHAT" alt="img" style="zoom:50%;" />

## 2. ์์ด์ด ํ๋ ์ ์ ์

![image-20220114092625434](README.assets/image-20220114092625434.png)





## 3. ์์ด์ด ํ๋ ์์ ๋ฆฌ์กํธ๋ก ์ฐ์ต

Email์ธ์ฆ ๋ถ๋ถ๋ง ๊ฐ๋จํ ์ฝ๋๋ฅผ ์ฌ๋ฆฌ๊ณ  ๋ค๋ฅธ๋ถ๋ถ์ ์ฌ์ง์ผ๋ก ๋์ฒดํฉ๋๋ค.

`Email.css`

```react
.input {
  flex: 1;
  font-size: 1rem;
  outline: none;
  border: none;
  border-bottom: 1px solid #969696;
}
.h4 {
  margin-left: 3px;
  color: #484848;
}
#navcolor {
  border: 0;

  background-color: #864A13;
  opacity: 0.8;
}
#NoBgButton {
  background-color : white;
  border: none;
  color : #1E4DF6;
  font-weight:500;
}

#NoBgExit {
  margin-right: auto;
  background-color : white;
  border: none;
  color : #484848;
  font-weight:500;
}
#ModalPadding {
  padding : 0;
}

#EmailMarginLeft {
  margin-left : 20px;
}
```

`EmailForm.js`

```react
import { Form, Button } from "react-bootstrap";
import './Email.css'

const AddForm = () => {
  
  return (
      <Form>
        <div id="navcolor">
          <br></br>
          <br></br>
        </div>
        <br></br>
        <br></br>
        <h4 id="EmailMarginLeft">์ด๋ฉ์ผ ์ธ์ฆ</h4>
        <p id="EmailMarginLeft"> ์ด๋ฉ์ผ๋ก ๋ฐ์ก๋ ์ฝ๋๋ฅผ ์๋ ฅํ์ธ์.</p>
        <Form.Group>
          
          <input
          id ="EmailMarginLeft"
          className="input"
          type="email"
          name="email"
          placeholder="์ด๋ฉ์ผ์ ์๋ ฅํ์ธ์.."
          />
        <br></br>
        <br></br>
        <a id ="EmailMarginLeft"> ์ด๋ฉ์ผ์ด ๋ฐ์ก๋๊ธฐ๊น์ง ์๊ฐ์ด ๋ค์ ์์๋  ์ ์์ต๋๋ค.</a>
        <p id ="EmailMarginLeft"> ์ด๋ฉ์ผ์ด ์ค์ง ์์๋ค๋ฉด <a href="#">์ฌ์์ฒญ</a> ๋ฒํผ์ ๋๋ฌ์ฃผ์ธ์.</p>
        <br></br>
        <br></br>
        <br></br>
        <br></br> 
        </Form.Group>
        </Form>
  )
}
export default AddForm;
```

`EmailModal.js`

```react
import { buildQueries } from '@testing-library/react';
import React from 'react';
import  { Modal, Button } from 'react-bootstrap';
import AddForm from './EmailForm';

const EmailModal = ( { show, onHide }) => {
  return (
    <Modal
      show = {show}
      onHide = {onHide}
      aria-labelledby="contained-modal-title-vcenter"
      dialogClassName="modal-w"
      centered
    >
      
       
      
      <Modal.Body id = "ModalPadding">
        <AddForm />
      </Modal.Body>
      <Modal.Footer>
        <Button id="NoBgExit" variant="secondary" onClick={onHide}>๋ซ๊ธฐ</Button>
        <Button id="NoBgButton" onClick={onHide}>์ธ์ฆํ๊ธฐ</Button>
      </Modal.Footer>
    </Modal>
  )
}

export default EmailModal
```

![image-20220114093019637](README.assets/image-20220114093019637.png)

![image-20220114093104655](README.assets/image-20220114093104655.png)

![image-20220114093051463](README.assets/image-20220114093051463.png)

## ๊ทธ ์ธ ๋ฆฌ์กํธ ๊ณต๋ถ

![image-20220114095136757](README.assets/image-20220114095136757.png)

๋ฆฌ์กํธ ํ์ต์  ๋ฐ๋๋ผ ์๋ฐ์คํฌ๋ฆฝํธ ๋ค์๊ณต๋ถ...

![image-20220114100454103](README.assets/image-20220114100454103.png)
