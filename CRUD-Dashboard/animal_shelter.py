from pymongo import MongoClient
import urllib.parse
from bson.objectid import ObjectId
from bson.json_util import dumps


class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """

    def __init__(self, username=None, password=None):
        # Initializing the MongoClient. This helps to
        # access the MongoDB databases and collections.
        
        if username and password:
            username = urllib.parse.quote_plus(username)
            password = urllib.parse.quote_plus(password)
            self.client = MongoClient('mongodb://%s:%s@localhost:48280/AAC' % (username, password))
        else:
            print("Must provide username and password")
            
        self.database = self.client['AAC']

    # Complete this create method to implement the C in CRUD.
    def create(self, data):
        if data is not None:
            if data:
                self.database.animals.insert_one(data)
                return True
        else:
            print("Nothing to save, data parameter is empty")
            return False

    # Create read method to implement the R in CRUD.
    def read(self, search):
        if search is not None:
            if search:
                result = list(self.database.animals.find(search).limit(50))
                return result
            else:
                return {}
        else:
            raise Exception("Nothing to search, search parameter is empty")
            
    # Create update method to implement the U in CRUD.
    def update(self, current_data, new_data):
        if current_data is not None:
            if current_data:
                result = self.database.animals.update_one(current_data, {"$set": new_data})
                return result
            else:
                return {}
        else:
            raise Exception("Nothing to update, search parameter is empty")
            
    # Create delete method to implement the D in CRUD.
    def delete(self, data):
        if data is not None:
            if data:
                result = self.database.animals.delete_one(data)
                return result
            else:
                return {}
        else:
            raise Exception("Nothing to delete, search parameter is empty")
            
    # Create read all method to return all records in db.
    def readAll(self):
        result = self.database.animals.find({}).limit(50)
#         print(list(result))
        return result
