from flask import Flask, jsonify, request
import requests
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

@app.route('/get_ip_info/<ip>', methods=['GET'])
def get_ip_info(ip):
    token = '27c7a9791a62c6'
    url = f'https://ipinfo.io/{ip}?token={token}'
    
    response = requests.get(url)
    
    if response.status_code == 200:
        return jsonify(response.json())
    else:
        return jsonify({'error': 'No se pudo obtener la información'}), response.status_code
    
@app.route('/')
def index():
    return 'Hola mundo'

if __name__ == '__main__':
    app.run(debug=True)