<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Clima extends Model
{
    use HasFactory;
    protected $table = 'clima';
    
    protected $fillable=[
        
        "fecha",
        "temperatura",
        "id"
        
    ];
}
