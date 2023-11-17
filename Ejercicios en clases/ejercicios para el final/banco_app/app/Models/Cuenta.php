<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cuenta extends Model
{
    use HasFactory;
    protected $table = 'banco_union_cuentas';
    protected $fillable=[
        //campos
        "id",
        "numero_cuenta",
        "moneda",
        "saldo",
        "codigo_cliente",
    ];
}
